package protocolsupport.protocol.serverboundtransformer;

import java.io.IOException;

import protocolsupport.protocol.DataStorage;
import protocolsupport.protocol.PacketDataSerializer;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import net.minecraft.server.v1_8_R1.BlockPosition;
import net.minecraft.server.v1_8_R1.EnumEntityUseAction;
import net.minecraft.server.v1_8_R1.Packet;

public class PlayPacketTransformer implements PacketTransformer {

	@Override
	public boolean tranform(Channel channel, int packetId, Packet packet, PacketDataSerializer serializer) throws IOException {
		if (serializer.getVersion() == DataStorage.CLIENT_1_8_PROTOCOL_VERSION) {
			return false;
		}
		PacketDataSerializer packetdata = new PacketDataSerializer(Unpooled.buffer(), serializer.getVersion());
		switch (packetId) {
			case 0x0A: { //PacketPlayInArmAnimation
				serializer.readInt();
				serializer.readByte();
				return true;
			}
			case 0x07: { //PacketPlayInBlockDig
				packetdata.writeByte(serializer.readUnsignedByte());
				packetdata.a(new BlockPosition(serializer.readInt(), serializer.readUnsignedByte(), serializer.readInt()));
				packetdata.writeByte(serializer.readUnsignedByte());
				break;
			}
			case 0x08: { //PacketPlayInBlockPlace
				packetdata.a(new BlockPosition(serializer.readInt(), serializer.readUnsignedByte(), serializer.readInt()));
				packetdata.writeByte(serializer.readUnsignedByte());
				packetdata.a(serializer.i());
				packetdata.writeByte(serializer.readUnsignedByte());
				packetdata.writeByte(serializer.readUnsignedByte());
				packetdata.writeByte(serializer.readUnsignedByte());
				break;
			}
			case 0x0B: { //PacketPlayInEntityAction
				packetdata.writeVarInt(serializer.readInt());
				packetdata.writeByte(serializer.readByte() - 1);
				packetdata.writeVarInt(serializer.readInt());
				break;
			}
			case 0x00: { //PacketPlayInKeepAlive
				packetdata.writeVarInt(serializer.readInt());
				break;
			}
			case 0x04: { //PacketPlayInPosition
				packetdata.writeDouble(serializer.readDouble());
				packetdata.writeDouble(serializer.readDouble());
				serializer.readDouble();
				packetdata.writeDouble(serializer.readDouble());
				packetdata.writeByte(serializer.readUnsignedByte());
				break;
			}
			case 0x06: { //PacketPlayInPositionLook
				packetdata.writeDouble(serializer.readDouble());
				packetdata.writeDouble(serializer.readDouble());
				serializer.readDouble();
				packetdata.writeDouble(serializer.readDouble());
				packetdata.writeFloat(serializer.readFloat());
				packetdata.writeFloat(serializer.readFloat());
				packetdata.writeByte(serializer.readUnsignedByte());
				break;
			}
			case 0x15: { //PackeyPlayInSettings
				packetdata.writeString(serializer.readString(7));
				packetdata.writeByte(serializer.readByte());
				packetdata.writeByte(serializer.readByte());
				packetdata.writeBoolean(serializer.readBoolean());
				serializer.readByte();
				serializer.readBoolean();
				packetdata.writeByte(0);
				break;
			}
			case 0x0C: { //PacletPlayInSteerVehicle
				packetdata.writeFloat(serializer.readFloat());
				packetdata.writeFloat(serializer.readFloat());
				packetdata.writeByte(serializer.readBoolean() ? 1 : 0 + (serializer.readBoolean() ? 1 << 1 : 0));
				break;
			}
			case 0x14: { //PacketPlayInTabComplete
				packetdata.writeString(serializer.readString(32767));
				packetdata.writeBoolean(false);
				break;
			}
			case 0x33: { //PacketPlayInUpdateSign
				packetdata.a(new BlockPosition(serializer.readInt(), serializer.readUnsignedByte(), serializer.readInt()));
				for (int i = 0; i < 4; i++) {
					packetdata.writeString(serializer.readString(15));
				}
				break;
			}
			case 0x02: { //PacketPlayInUseEntity
				packetdata.writeVarInt(serializer.readInt());
				packetdata.writeVarInt(serializer.readByte() % EnumEntityUseAction.values().length);
				break;
			}
		}
		if (packetdata.readableBytes() > 0) {
			packet.a(packetdata);
			return true;
		}
		return false;
	}

}
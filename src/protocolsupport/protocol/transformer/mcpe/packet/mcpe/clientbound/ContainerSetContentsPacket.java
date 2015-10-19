package protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound;

import net.minecraft.server.v1_8_R3.ItemStack;
import io.netty.buffer.ByteBuf;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.PacketDataSerializer;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.ClientboundPEPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.PEPacketIDs;

public class ContainerSetContentsPacket implements ClientboundPEPacket {

	public static final int[] HOTBAR_SLOTS = new int[] {36, 37, 38, 39, 40, 41, 42, 43, 44};
	public static final int[] EMPTY_HOTBAR_SLOTS = new int[0];

	protected int windowId;
	protected ItemStack[] contents;
	protected int[] hotbar;

	public ContainerSetContentsPacket(int windowId, ItemStack[] contents, int[] hotbar) {
		this.windowId = windowId;
		this.contents = contents;
		this.hotbar = hotbar;
	}

	@Override
	public int getId() {
		return PEPacketIDs.CONTAINER_SET_CONTENT_PACKET;
	}

	@Override
	public ClientboundPEPacket encode(ByteBuf buf) throws Exception {
		PacketDataSerializer serializer = new PacketDataSerializer(buf, ProtocolVersion.MINECRAFT_PE);
		serializer.writeByte(windowId);
		serializer.writeShort(contents.length);
		for (ItemStack itemstack : contents) {
			serializer.writeItemStack(itemstack);
		}
		buf.writeShort(hotbar.length);
		for (int slot : hotbar) {
			buf.writeInt(slot);
		}
		return this;
	}

}

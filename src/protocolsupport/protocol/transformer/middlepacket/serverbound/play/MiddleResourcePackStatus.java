package protocolsupport.protocol.transformer.middlepacket.serverbound.play;

import net.minecraft.server.v1_9_R1.Packet;
import protocolsupport.protocol.ServerBoundPacket;
import protocolsupport.protocol.transformer.middlepacket.ServerBoundMiddlePacket;
import protocolsupport.protocol.transformer.middlepacketimpl.PacketCreator;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public abstract class MiddleResourcePackStatus extends ServerBoundMiddlePacket {

	protected String hash;
	protected int result;

	@Override
	public RecyclableCollection<? extends Packet<?>> toNative() throws Exception {
		PacketCreator creator = PacketCreator.create(ServerBoundPacket.PLAY_RESOURCE_PACK_STATUS.get());
		creator.writeString(hash);
		creator.writeVarInt(result);
		return RecyclableSingletonList.create(creator.create());
	}

}

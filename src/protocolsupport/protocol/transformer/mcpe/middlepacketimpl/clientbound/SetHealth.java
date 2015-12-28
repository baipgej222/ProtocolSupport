package protocolsupport.protocol.transformer.mcpe.middlepacketimpl.clientbound;

import java.io.IOException;

import net.minecraft.server.v1_8_R3.MathHelper;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.ClientboundPEPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.both.SetHealthPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.RespawnPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.SetAttributesPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.SetAttributesPacket.AttributeRecord;
import protocolsupport.protocol.transformer.middlepacket.clientbound.play.MiddleSetHealth;
import protocolsupport.utils.recyclable.RecyclableArrayList;
import protocolsupport.utils.recyclable.RecyclableCollection;

public class SetHealth extends MiddleSetHealth<RecyclableCollection<? extends ClientboundPEPacket>> {

	@Override
	public RecyclableCollection<? extends ClientboundPEPacket> toData(ProtocolVersion version) throws IOException {
		RecyclableArrayList<ClientboundPEPacket> list = RecyclableArrayList.create();
		list.add(new SetHealthPacket(MathHelper.f(health)));
		list.add(new SetAttributesPacket(
			player.getEntityId(),
			new AttributeRecord("player.saturation", 0.0F, 5.0F, saturation),
			new AttributeRecord("player.hunger", 0.0F, 20.0F, food)
		));
		if (health <= 0.0F) {
			list.add(new RespawnPacket());
		}
		return list;
	}

}

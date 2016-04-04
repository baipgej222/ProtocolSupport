package protocolsupport.protocol.transformer.middlepacketimpl.clientbound.play.v_1_4_1_5;

import java.io.IOException;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.ClientBoundPacket;
import protocolsupport.protocol.transformer.middlepacket.clientbound.play.MiddleSetPassengers;
import protocolsupport.protocol.transformer.middlepacketimpl.PacketData;
import protocolsupport.utils.recyclable.RecyclableCollection;
import protocolsupport.utils.recyclable.RecyclableSingletonList;

public class SetPassengers extends MiddleSetPassengers<RecyclableCollection<PacketData>> {

	protected int passengerId;

	@Override
	public RecyclableCollection<PacketData> toData(ProtocolVersion version) throws IOException {
		PacketData serializer = PacketData.create(ClientBoundPacket.PLAY_ENTITY_ATTACH_ID, version);
		serializer.writeInt(passengerId);
		serializer.writeInt(passengersIds.length == 0 ? -1 : vehicleId);
		return RecyclableSingletonList.create(serializer);
	}

	@Override
	public void handle() {
		if (passengersIds.length == 0) {
			passengerId = storage.getVehiclePassenger(vehicleId);
			storage.removeVehiclePassenger(vehicleId);
		} else {
			passengerId = passengersIds[0];
			storage.setVehiclePassenger(vehicleId, passengerId);
		}
	}

}

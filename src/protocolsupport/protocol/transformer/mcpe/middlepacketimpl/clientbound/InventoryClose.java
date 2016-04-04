package protocolsupport.protocol.transformer.mcpe.middlepacketimpl.clientbound;

import java.io.IOException;

import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;

import net.minecraft.server.v1_9_R1.Block;
import net.minecraft.server.v1_9_R1.BlockPosition;
import net.minecraft.server.v1_9_R1.EntityPlayer;
import net.minecraft.server.v1_9_R1.IBlockData;
import net.minecraft.server.v1_9_R1.World;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.ClientboundPEPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.both.ContainerClosePacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.MethodCallPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.SetBlocksPacket;
import protocolsupport.protocol.transformer.mcpe.packet.mcpe.clientbound.SetBlocksPacket.UpdateBlockRecord;
import protocolsupport.protocol.transformer.middlepacket.clientbound.play.MiddleInventoryClose;
import protocolsupport.utils.recyclable.RecyclableArrayList;
import protocolsupport.utils.recyclable.RecyclableCollection;

public class InventoryClose extends MiddleInventoryClose<RecyclableCollection<? extends ClientboundPEPacket>> {

	@Override
	public boolean needsPlayer() {
		return true;
	}

	@Override
	public RecyclableCollection<? extends ClientboundPEPacket> toData(ProtocolVersion version) throws IOException {
		final EntityPlayer eplayer = ((CraftPlayer) player).getHandle();
		RecyclableArrayList<ClientboundPEPacket> packets = RecyclableArrayList.create();
		BlockPosition position = storage.getPEStorage().getFakeInventoryBlock();
		if (position != null) {
			storage.getPEStorage().clearFakeInventoryBlock();
			World world = eplayer.world;
			if (world.isLoaded(position)) {
				IBlockData block = world.getType(position);
				packets.add(new SetBlocksPacket(new UpdateBlockRecord(
					position.getX(), 0, position.getZ(),
					Block.getId(block.getBlock()), block.getBlock().toLegacyData(block),
					SetBlocksPacket.FLAG_ALL_PRIORITY
				)));
			}
		}
		packets.add(new ContainerClosePacket(windowId));
		packets.add(new MethodCallPacket() {
			@Override
			protected void call() {
				eplayer.updateInventory(eplayer.defaultContainer);
			}
		});
		return packets;
	}

}

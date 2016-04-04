package protocolsupport.protocol.typeremapper.id;

import org.bukkit.entity.EntityType;

import org.bukkit.Material;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.api.ProtocolSupportAPI;
import protocolsupport.api.remapper.BlockRemapperControl;
import protocolsupport.utils.ProtocolVersionsHelper;

public class IdRemapper {

	public static final RemappingRegistry BLOCK = new RemappingRegistry() {
		{
			registerRemapEntry(Material.CHORUS_FLOWER, Material.WOOD, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.CHORUS_PLANT, Material.WOOD, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.END_GATEWAY, Material.ENDER_PORTAL, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.END_ROD, Material.GLOWSTONE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.END_BRICKS, Material.ENDER_STONE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.FROSTED_ICE, Material.ICE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.GRASS_PATH, Material.GRASS, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.PURPUR_BLOCK, Material.STONE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.PURPUR_PILLAR, Material.STONE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.PURPUR_STAIRS, Material.COBBLESTONE_STAIRS, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.PURPUR_SLAB, Material.STONE_SLAB2, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.PURPUR_DOUBLE_SLAB, Material.DOUBLE_STONE_SLAB2, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.STRUCTURE_BLOCK, Material.BEDROCK, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BEETROOT_BLOCK, Material.CROPS, ProtocolVersionsHelper.BEFORE_1_9);
			// slime -> emerald block
			registerRemapEntry(165, 133, ProtocolVersionsHelper.BEFORE_1_8);
			// barrier -> glass
			registerRemapEntry(166, 20, ProtocolVersionsHelper.BEFORE_1_8);
			// iron trapdoor -> trapdoor
			registerRemapEntry(167, 96, ProtocolVersionsHelper.BEFORE_1_8);
			// prismarine -> mossy cobblestone
			registerRemapEntry(168, 48, ProtocolVersionsHelper.BEFORE_1_8);
			// sea lantern -> glowstone
			registerRemapEntry(169, 89, ProtocolVersionsHelper.BEFORE_1_8);
			// standing banner -> standing sign
			registerRemapEntry(176, 63, ProtocolVersionsHelper.BEFORE_1_8);
			// wall banner -> wall sign
			registerRemapEntry(177, 68, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone -> sandstone
			registerRemapEntry(179, 24, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone stairs -> sandstone stairs
			registerRemapEntry(180, 128, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone doubleslab -> double step
			registerRemapEntry(181, 43, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone slab -> step
			registerRemapEntry(182, 44, ProtocolVersionsHelper.BEFORE_1_8);
			// all fence gates -> fence gate
			registerRemapEntry(183, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(184, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(185, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(186, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(187, 107, ProtocolVersionsHelper.BEFORE_1_8);
			// all fences -> fence
			registerRemapEntry(188, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(189, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(190, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(191, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(192, 85, ProtocolVersionsHelper.BEFORE_1_8);
			// all doors -> door
			registerRemapEntry(193, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(194, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(195, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(196, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(197, 64, ProtocolVersionsHelper.BEFORE_1_8);
			// inverted daylight detector -> daylight detector
			registerRemapEntry(178, 151, ProtocolVersionsHelper.BEFORE_1_8);
			// stained glass -> glass
			registerRemapEntry(95, 20, ProtocolVersionsHelper.BEFORE_1_7);
			// stained glass pane -> glass pane
			registerRemapEntry(160, 102, ProtocolVersionsHelper.BEFORE_1_7);
			// leaves2 -> leaves
			registerRemapEntry(161, 18, ProtocolVersionsHelper.BEFORE_1_7);
			// log2 -> log
			registerRemapEntry(162, 17, ProtocolVersionsHelper.BEFORE_1_7);
			// acacia stairs -> oak stairs
			registerRemapEntry(163, 53, ProtocolVersionsHelper.BEFORE_1_7);
			// dark oak stairs -> oak stairs
			registerRemapEntry(164, 53, ProtocolVersionsHelper.BEFORE_1_7);
			// tall plant -> yellow flower
			registerRemapEntry(175, 38, ProtocolVersionsHelper.BEFORE_1_7);
			// packed ice -> snow
			registerRemapEntry(174, 80, ProtocolVersionsHelper.BEFORE_1_7);
			// stained clay -> stone
			registerRemapEntry(159, 1, ProtocolVersionsHelper.BEFORE_1_6);
			// hay bale -> stone
			registerRemapEntry(170, 1, ProtocolVersionsHelper.BEFORE_1_6);
			// carpet -> stone pressure plate
			registerRemapEntry(171, 70, ProtocolVersionsHelper.BEFORE_1_6);
			// hardened clay -> clay
			registerRemapEntry(172, 82, ProtocolVersionsHelper.BEFORE_1_6);
			// coal block -> stone
			registerRemapEntry(173, 1, ProtocolVersionsHelper.BEFORE_1_6);
			// dropper -> stone
			registerRemapEntry(178, 1, ProtocolVersionsHelper.BEFORE_1_5);
			// hopper -> stone
			registerRemapEntry(154, 1, ProtocolVersionsHelper.BEFORE_1_5);
			// quartz -> snow
			registerRemapEntry(155, 80, ProtocolVersionsHelper.BEFORE_1_5);
			// quartz stairs -> stairs
			registerRemapEntry(156, 109, ProtocolVersionsHelper.BEFORE_1_5);
			// quartz slab -> slab
			registerRemapEntry(156, 44, ProtocolVersionsHelper.BEFORE_1_5);
			// inverted daylight detector -> stone
			registerRemapEntry(178, 1, ProtocolVersionsHelper.BEFORE_1_5);
			// daylight detector -> slab
			registerRemapEntry(151, 44, ProtocolVersionsHelper.BEFORE_1_5);
			// trapped chest -> chest
			registerRemapEntry(146, 54, ProtocolVersionsHelper.BEFORE_1_5);
			// redstone block -> glowing redstone ore
			registerRemapEntry(146, 73, ProtocolVersionsHelper.BEFORE_1_5);
			// activator rail -> some other rail
			registerRemapEntry(157, 28, ProtocolVersionsHelper.BEFORE_1_5);
			// nether quartz ore -> nettherrack
			registerRemapEntry(153, 87, ProtocolVersionsHelper.BEFORE_1_5);
			// wpressure plate light -> wood pressure plate
			registerRemapEntry(147, 72, ProtocolVersionsHelper.BEFORE_1_5);
			// wpressure plate heavy -> stone pressure plate
			registerRemapEntry(148, 70, ProtocolVersionsHelper.BEFORE_1_5);
			// redstone comparator -> repeater
			registerRemapEntry(149, 93, ProtocolVersionsHelper.BEFORE_1_5);

			// MCPE
			// stained glass -> glass (TODO: Check)
			registerRemapEntry(95, 20, ProtocolVersion.MINECRAFT_PE);
			// stained glass pane -> glass pane (TODO: Check)
			registerRemapEntry(160, 102, ProtocolVersion.MINECRAFT_PE);
			// sea lantern -> glowstone
			registerRemapEntry(169, 89, ProtocolVersion.MINECRAFT_PE);
			// prismarine -> mossy cobblestone
			registerRemapEntry(168, 48, ProtocolVersion.MINECRAFT_PE);
			// wood slab -> wood slab (MCPE ID remap)
			registerRemapEntry(126, 158, ProtocolVersion.MINECRAFT_PE);
			// standing banner -> standing sign
			registerRemapEntry(176, 63, ProtocolVersion.MINECRAFT_PE);
			// wall banner -> wall sign
			registerRemapEntry(177, 68, ProtocolVersion.MINECRAFT_PE);
			// (sticky) piston -> stone
			registerRemapEntry(29, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(33, 1, ProtocolVersion.MINECRAFT_PE);
			// piston head -> stone
			registerRemapEntry(34, 1, ProtocolVersion.MINECRAFT_PE);
			// double oak slab -> double oak slab (MCPE ID remap)
			registerRemapEntry(125, 157, ProtocolVersion.MINECRAFT_PE);
			// enderchest -> chest
			registerRemapEntry(130, 54, ProtocolVersion.MINECRAFT_PE);
			// command block -> stone
			registerRemapEntry(137, 1, ProtocolVersion.MINECRAFT_PE);
			// beacon -> nether reactor core
			registerRemapEntry(138, 247, ProtocolVersion.MINECRAFT_PE);
			// activator rail -> carpet
			registerRemapEntry(157, 171, ProtocolVersion.MINECRAFT_PE);
			// barrier -> invisible bedrock (TODO: Check)
			registerRemapEntry(166, 95, ProtocolVersion.MINECRAFT_PE);
			// fences -> fence
			registerRemapEntry(188, 85, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(189, 85, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(190, 85, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(191, 85, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(192, 85, ProtocolVersion.MINECRAFT_PE);
		}
		@SuppressWarnings("deprecation")
		protected void registerRemapEntry(Material from, Material to, ProtocolVersion... versions) {
			registerRemapEntry(from.getId(), to.getId(), versions);
		}
		public void registerRemapEntry(int from, int to, ProtocolVersion... versions) {
			for (int i = 0; i < 16; i++) {
				super.registerRemapEntry((from << 4) + i, (to << 4) + i, versions);
			}
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(4096 * 16);
		}
	};

	public static final RemappingRegistry ITEM = new RemappingRegistry() {
		{
			for (ProtocolVersion version : ProtocolVersion.values()) {
				if (version.isSupported()) {
					BlockRemapperControl ctrl = ProtocolSupportAPI.getBlockRemapper(version);
					for (int i = 0; i < 4096; i++) {
						registerRemapEntry(i, ctrl.getRemap(i), version);
					}
				}
			}
			registerRemapEntry(Material.BEETROOT, Material.BROWN_MUSHROOM, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BEETROOT_SOUP, Material.MUSHROOM_SOUP, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BEETROOT_SEEDS, Material.SEEDS, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.CHORUS_FRUIT, Material.POTATO_ITEM, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.CHORUS_FRUIT_POPPED, Material.BAKED_POTATO, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.DRAGONS_BREATH, Material.POTION, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.SPLASH_POTION, Material.POTION, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.LINGERING_POTION, Material.POTION, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.ELYTRA, Material.LEATHER_CHESTPLATE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.END_CRYSTAL, Material.STONE, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.SHIELD, Material.WOOD_SWORD, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.SPECTRAL_ARROW, Material.ARROW, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.TIPPED_ARROW, Material.ARROW, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BOAT_ACACIA, Material.BOAT, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BOAT_BIRCH, Material.BOAT, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BOAT_DARK_OAK, Material.BOAT, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BOAT_JUNGLE, Material.BOAT, ProtocolVersionsHelper.BEFORE_1_9);
			registerRemapEntry(Material.BOAT_SPRUCE, Material.BOAT, ProtocolVersionsHelper.BEFORE_1_9);
			// all doors -> door
			registerRemapEntry(427, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(428, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(429, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(430, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(431, 324, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit raw meat -> chicken raw meat
			registerRemapEntry(411, 365, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit cooked meat -> chicken cooked meat
			registerRemapEntry(412, 366, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit stew -> mushroom stew
			registerRemapEntry(413, 282, ProtocolVersionsHelper.BEFORE_1_8);
			// raw mutton -> chicken raw meat
			registerRemapEntry(423, 365, ProtocolVersionsHelper.BEFORE_1_8);
			// cooked mutton -> chicken cooked meat
			registerRemapEntry(424, 366, ProtocolVersionsHelper.BEFORE_1_8);
			// banner -> sign
			registerRemapEntry(425, 323, ProtocolVersionsHelper.BEFORE_1_8);
			// everything else -> stone
			registerRemapEntry(409, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(410, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(414, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(415, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(416, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(417, 1, ProtocolVersionsHelper.BEFORE_1_6);
			registerRemapEntry(418, 1, ProtocolVersionsHelper.BEFORE_1_6);
			registerRemapEntry(419, 1, ProtocolVersionsHelper.BEFORE_1_6);
			registerRemapEntry(420, 1, ProtocolVersionsHelper.BEFORE_1_6);
			registerRemapEntry(421, 1, ProtocolVersionsHelper.BEFORE_1_6);
			// minecarts -> default minecart
			registerRemapEntry(407, 328, ProtocolVersionsHelper.BEFORE_1_5);
			registerRemapEntry(408, 328, ProtocolVersionsHelper.BEFORE_1_5);
			// comparator -> repeater
			registerRemapEntry(404, 356, ProtocolVersionsHelper.BEFORE_1_5);
			// nether brick -> brick
			registerRemapEntry(405, 336, ProtocolVersionsHelper.BEFORE_1_5);
			// quartz -> feather
			registerRemapEntry(406, 288, ProtocolVersionsHelper.BEFORE_1_5);

			// MCPE
			// map -> paper
			registerRemapEntry(358, 339, ProtocolVersion.MINECRAFT_PE);
			// empty map -> paper
			registerRemapEntry(395, 339, ProtocolVersion.MINECRAFT_PE);
			// carrot stick -> stick
			registerRemapEntry(398, 280, ProtocolVersion.MINECRAFT_PE);
			// nether star -> stone
			registerRemapEntry(399, 1, ProtocolVersion.MINECRAFT_PE);
			// banner -> sign
			registerRemapEntry(425, 323, ProtocolVersion.MINECRAFT_PE);
			// raw mutton -> chicken raw meat
			registerRemapEntry(423, 365, ProtocolVersion.MINECRAFT_PE);
			// cooked mutton -> chicken cooked meat
			registerRemapEntry(424, 366, ProtocolVersion.MINECRAFT_PE);
			// ender pearl -> snowball
			registerRemapEntry(368, 332, ProtocolVersion.MINECRAFT_PE);
			// eye of ender -> snowball
			registerRemapEntry(381, 332, ProtocolVersion.MINECRAFT_PE);
			// firework -> stone
			registerRemapEntry(401, 1, ProtocolVersion.MINECRAFT_PE);
			// firework charge -> stone
			registerRemapEntry(402, 1, ProtocolVersion.MINECRAFT_PE);;
			registerRemapEntry(422, 328, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(342, 328, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(343, 328, ProtocolVersion.MINECRAFT_PE);
			// buckets -> stone
			registerRemapEntry(325, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(326, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(327, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(335, 1, ProtocolVersion.MINECRAFT_PE);
			// everything else -> stone
			registerRemapEntry(409, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(414, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(415, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(416, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(417, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(418, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(419, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(420, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(421, 1, ProtocolVersion.MINECRAFT_PE);
			// all discs -> stone
			registerRemapEntry(2256, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2257, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2258, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2259, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2260, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2261, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2262, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2263, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2264, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2265, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2266, 1, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(2267, 1, ProtocolVersion.MINECRAFT_PE);
		}
		@SuppressWarnings("deprecation")
		private void registerRemapEntry(Material from, Material to, ProtocolVersion... versions) {
			registerRemapEntry(from.getId(), to.getId(), versions);
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(4096);
		}
	};

	@SuppressWarnings("deprecation")
	public static final RemappingRegistry ENTITY_LIVING = new RemappingRegistry() {
		{
			// sulker -> blaze
			registerRemapEntry(69, 61, ProtocolVersionsHelper.BEFORE_1_9);
			// endermite -> silverfish
			registerRemapEntry(67, 60, ProtocolVersionsHelper.BEFORE_1_8);
			// guardian -> sqiud
			registerRemapEntry(68, 94, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit -> chicken
			registerRemapEntry(101, 93, ProtocolVersionsHelper.BEFORE_1_8);
			// horse -> cow
			registerRemapEntry(100, 92, ProtocolVersionsHelper.BEFORE_1_6);

			// MCPE
			//-1 for not supported entities
			for (int i = 0; i < 256; i++) {
				registerRemapEntry(i, -1, ProtocolVersion.MINECRAFT_PE);
			}
			//correct entity ids, no remap
			registerRemapEntry(EntityType.CREEPER.getTypeId(), 33, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SKELETON.getTypeId(), 34, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SPIDER.getTypeId(), 35, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.ZOMBIE.getTypeId(), 32, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SLIME.getTypeId(), 37, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.GHAST.getTypeId(), 41, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.PIG_ZOMBIE.getTypeId(), 36, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.ENDERMAN.getTypeId(), 38, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.CAVE_SPIDER.getTypeId(), 40, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SILVERFISH.getTypeId(), 39, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.BLAZE.getTypeId(), 43, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.MAGMA_CUBE.getTypeId(), 42, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.BAT.getTypeId(), 19, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.PIG.getTypeId(), 12, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SHEEP.getTypeId(), 13, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.COW.getTypeId(), 11, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.CHICKEN.getTypeId(), 10, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SQUID.getTypeId(), 17, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.WOLF.getTypeId(), 14, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.MUSHROOM_COW.getTypeId(), 16, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.SNOWMAN.getTypeId(), 21, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.OCELOT.getTypeId(), 22, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.IRON_GOLEM.getTypeId(), 20, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.VILLAGER.getTypeId(), 15, ProtocolVersion.MINECRAFT_PE);
			registerRemapEntry(EntityType.RABBIT.getTypeId(), 18, ProtocolVersion.MINECRAFT_PE);
			// witch -> skeleton
			registerRemapEntry(EntityType.WITCH.getTypeId(), 34, ProtocolVersion.MINECRAFT_PE);
			// endermite -> silverfish
			registerRemapEntry(EntityType.ENDERMITE.getTypeId(), 39, ProtocolVersion.MINECRAFT_PE);
			// guardian -> sqiud
			registerRemapEntry(EntityType.GUARDIAN.getTypeId(), 17, ProtocolVersion.MINECRAFT_PE);
			// horse -> cow
			registerRemapEntry(EntityType.HORSE.getTypeId(), 11, ProtocolVersion.MINECRAFT_PE);

		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(256);
		}
	};

	public static final RemappingRegistry ENTITY_OBJECT = new RemappingRegistry() {
		{
			//shulker bullet -> firecharge
			registerRemapEntry(67, 64, ProtocolVersionsHelper.BEFORE_1_9);
			//dragon fireball -> firecharge
			registerRemapEntry(93, 64, ProtocolVersionsHelper.BEFORE_1_9);
			//spectral arrow -> arrow
			registerRemapEntry(91, 60, ProtocolVersionsHelper.BEFORE_1_9);
			//tipped arrow -> arrow
			registerRemapEntry(92, 60, ProtocolVersionsHelper.BEFORE_1_9);
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(256);
		}
	};

	public static final RemappingRegistry MAPCOLOR = new RemappingRegistry() {
		{
			//see http://minecraft.gamepedia.com/Map_item_format (i don't event know a names for half of those colors)
			registerRemapEntry(14, 8, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(15, 10, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(16, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(17, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(18, 2, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(19, 1, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(20, 4, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(21, 11, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(22, 11, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(23, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(24, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(25, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(26, 10, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(27, 7, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(28, 4, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(29, 11, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(30, 2, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(31, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(32, 5, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(33, 7, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(34, 10, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(35, 4, ProtocolVersionsHelper.BEFORE_1_7);
			registerRemapEntry(36, 10, ProtocolVersionsHelper.BEFORE_1_7);
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(64) {
				@Override
				public int getRemap(int id) {
					int realColor = (id & 0xFF) >> 2;
					return ((table[realColor] << 2) + (id & 0b11));
				}
			};
		}
	};

}

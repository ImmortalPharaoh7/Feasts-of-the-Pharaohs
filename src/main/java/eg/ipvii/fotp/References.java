package eg.ipvii.fotp;

public class References {
    public static final String MOD_ID = "FotP";
    public static final String NAME = "Feast of the Pharaohs";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_MC_VERSIONS = "[1.10.2]";

    public static final String CLIENT_PROXY_CLASS = "eg.ipvii.fotp.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "eg.ipvii.fotp.proxy.ServerProxy";

    public static enum FotPItems{
        FUL("ful", "ItemFul"),
        PLAINSANDWICH("plainsandwich", "ItemPlainSandwich");

        private String unlocalizedName;
        private String registryName;

        FotPItems(String UnlocalizedName, String RegistryName){
            unlocalizedName = UnlocalizedName;
            registryName = RegistryName;

        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
    public static enum FotPBlocks{
        MUD("mud", "BlockMud"),
        JAR("jar", "BlockJar");

        private String unlocalizedName;
        private String registryName;

        FotPBlocks(String UnlocalizedName, String RegistryName){
            unlocalizedName = UnlocalizedName;
            registryName = RegistryName;

        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}

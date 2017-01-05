<<<<<<< HEAD
package eg.ipvii.fotp;

public class References {
    public static final String MOD_ID = "FotP";
    public static final String NAME = "Feast of the Pharaohs";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_MC_VERSIONS = "[1.10.2]";

    public static final String CLIENT_PROXY_CLASS = "eg.ipvii.fotp.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "eg.ipvii.fotp.proxy.ServerProxy";

    public enum FotPItems{
        FUL("ful", "itemful"),
        PLAINSANDWICH("plainsandwich", "itemplainsandwich"),
        FULSANDWICH("fulsandwich", "itemfulsandwich"),
        BEANS("beans", "itembeans"),
        RAWPASTRAMI("rawpastrami", "itemrawpastrami"),
        PASTRAMI("pastrami", "itempastrami"),
        CUMIN("cumin", "itemcumin"),
        GARLIC("garlic", "itemgarlic"),
        MUDBALL("mudball", "itemmudball"),
        EARTHENWARE("earthenware", "itemearthenware"),
        MORTARANDPESTLE("mortarandpestle", "itemmortarandpestle"),
        EARTHENWAREBOWL("earthenwarebowl", "itemearthenwarebowl"),
        EARTHENWARESTICK("earthenwarestick", "itemearthenwarestick"),
        REDPEPPER("redpepper", "itemredpepper"),
        REDPEPPERSEEDS("redpepperseeds", "itemredpepperseeds"),
        OKRA("okra", "itemokra"),
        OKRASEEDS("okraseeds", "itemokraseeds"),
        RICE("rice", "itemrice"),
        RICESEEDS("riceseeds", "itemriceseeds"),
        PAPRIKAPOWDER("paprikapowder", "itempaprikapowder"),
        TOMATO("tomato", "itemtomato"),
        TOMATOSEEDS("tomatoseeds", "itemtomatoseeds"),
        TOMATOSAUCE("tomatosauce", "itemtomatosauce"),
        PRESSER("presser", "itempresser");

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
    public enum FotPBlocks{
        MUD("mud", "blockmud"),
        JAR("jar", "blockjar"),
        BEANSCROP("beanscrop", "cropbeans"),
        CUMMINCROP("cumincrop", "cropcumin"),
        GARLICCROP("garliccrop", "cropgarlic"),
        REDPEPPERCROP("redpeppercrop", "cropredpepper"),
        OKRACROP("okracrop", "cropokra"),
        RICECROP("ricecrop", "croprice"),
        TOMATOCROP("tomatocrop", "croptomato");

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
=======
package eg.ipvii.fotp;

public class References {
    public static final String MOD_ID = "FotP";
    public static final String NAME = "Feast of the Pharaohs";
    public static final String VERSION = "1.0";
    public static final String ACCEPTED_MC_VERSIONS = "[1.10.2]";

    public static final String CLIENT_PROXY_CLASS = "eg.ipvii.fotp.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "eg.ipvii.fotp.proxy.ServerProxy";

    public enum FotPItems{
        FUL("ful", "itemful"),
        PLAINSANDWICH("plainsandwich", "itemplainsandwich"),
        FULSANDWICH("fulsandwich", "itemfulsandwich"),
        BEANS("beans", "itembeans");

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
    public enum FotPBlocks{
        MUD("mud", "blockmud"),
        JAR("jar", "blockjar"),
        BEANSCROP("beanscrop", "cropbeans");

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
>>>>>>> a10b4a66619225eb78a70ecde64e14b3b339936b

package net.zffu.eznpcs.api;

/**
 * API Provider for the {@link EzNPCs} api.
 * @since 0.0.1
 */
public class EzAPIProvider {

    /**
     * The currently running instance of the API.
     */
    private static EzNPCs instance;

    /**
     * Used to get the current running instance of the API.
     * @return the current running api instance as an {@link EzNPCs} object.
     */
    public static EzNPCs get() throws ProviderException {
        if(instance == null) throw new ProviderException();
        return instance;
    }

    /**
     * Used to register the {@link EzNPCs} api instance. Should only be used by the plugin itself.
     * @param apiInstance the instance of the api as an {@link EzNPCs} object.
     */
    public static void register(EzNPCs apiInstance) {
        instance = apiInstance;
    }

    /**
     * Thrown when the instance is null.
     */
    public static class ProviderException extends Exception {
        public ProviderException() {
            super("Could not get the current EzNPCs API Instance! The plugin is most likely not loaded!");
        }
    }
}

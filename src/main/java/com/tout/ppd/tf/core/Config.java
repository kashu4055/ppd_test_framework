package com.tout.ppd.tf.core;

public class Config {
	
	private static final Environments ALL_ENVIRONMENTS;
	static {
		YamlParser yaml = new YamlParser("environment.yml");
		ALL_ENVIRONMENTS = yaml.parseAs(Environments.class);
	}
	private static Environment GLOBAL_ENVIRONMENT;
	
	private Config(){}
	
	public static Config getConfig(){
		return new Config();
	}
	
	public static void setGlobalEnvironment(String environmentKey){
		GLOBAL_ENVIRONMENT = ALL_ENVIRONMENTS.environments.get(environmentKey);
	}
	
	public Environment getEnvironmentSettings(){
		return GLOBAL_ENVIRONMENT;
	}
	
}

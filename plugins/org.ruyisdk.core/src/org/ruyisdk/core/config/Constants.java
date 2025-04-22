package org.ruyisdk.core.config;

/**
 * Constants 程序设计设定，用户不需要修改，由开发者在产品迭代优化中按需修改
 */
public final class Constants {

	public static final class AppInfo {
		public static final String AppDir = "ruyisdkide"; // XDG-Dir
	}
	
	public static final class ConfigFile {
		public static final String DeviceProperties = "devices.properties"; 
		public static final String RuyiProperties = "ruyi.properties"; 
	}
	
	// 网络端点（基础设施URL）
	public static final class NetAddress {
		private static final String MIRROR_BASE = "https://mirror.iscas.ac.cn";
		public static final String MIRROR_INDEX_ALTERNATE = MIRROR_BASE +"/git/ruyisdk/packages-index.git";
		
		public static final String MIRROR_RUYI_RELEASES = MIRROR_BASE + "/ruyisdk/ruyi/releases/";

		private static final String GITHUB_BASE = "https://github.com/ruyisdk";
		public static final String GITHUB_RUYI_RELEASES = GITHUB_BASE + "/ruyi/releases/";
		public static final String GITHUB_IDE_RELEASES = GITHUB_BASE + "/ruyisdk-eclipse-packages/releases/";
		public static final String GITHUB_IDEPLUGINS_RELEASES = GITHUB_BASE + "/ruyisdk-eclipse-plugins/releases/";
		
		public static final String  WEBSIT = "https://ruyisdk.org";
		
	}
	
	// 安装配置
	public static final class Ruyi {
		public static String DEFAULT_PATH = "~/.local/bin/"; //ruyi install path;"/usr/local/bin/" 
		public static final String BACKUP_PREFIX = "ruyi.backup.";
	}
}
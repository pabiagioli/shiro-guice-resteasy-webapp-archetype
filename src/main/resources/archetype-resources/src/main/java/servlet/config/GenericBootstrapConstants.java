#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.servlet.config;

/**
 * Generic constants for Bootstrapping the WebApp
 * 
 * @author pablo.biagioli
 *
 */
public class GenericBootstrapConstants {

	/**
	 * packages where the RestEasy Resources are, separated by commas
	 */
	public static final String REST_EASY_REST_PACKAGES="${package}.rest";
	
	public static final String REST_EASY_REST_PACKAGES_SUFFIX=".rest";
	
	/**
	 * main properties file that gets loaded at first
	 */
	public static final String BOOTSTRAP_PROPERTIES_FILE="bootstrap.properties";
}

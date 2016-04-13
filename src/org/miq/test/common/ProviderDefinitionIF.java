package org.miq.test.common;

import org.miq.test.webui.Form;
import org.miq.test.webui.FormButton;

/**
 * Define Provider identifiable properties and button action handlers
 * 
 */
public interface ProviderDefinitionIF {
	 //   STATS_TO_MATCH = []
	
		/**
		 * @return provider name
		 */
		String string_name();

		/**
		 * @return provider page name
		 */
		String page_name();
		
		String edit_page_suffix();
		
	    String detail_page_suffix();
	    
	    String refresh_text();
	   
	    String quad_name();
	    
	    Form properties_form();
	    
	    /**
	     * Get provider-add button handler
	     * @return FormButton handler
	     */
	    FormButton add_provider_button();
	    
	    /**
	     * Get provider-save button handler
	     * @return FormButton handler
	     */
	    FormButton save_button();	
}

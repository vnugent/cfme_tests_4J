package org.miq.test.middleware;

import java.util.ArrayList;
import java.util.List;

import org.miq.test.common.BaseProvider;
import org.miq.test.common.Kwargs;
import org.miq.test.webui.AngularSelect;
import org.miq.test.webui.Form;
import org.miq.test.webui.FormButton;
import org.miq.test.webui.Input;
import org.miq.test.common.Tuple;

/**
 * File: cfme/middleware/provider.py
 *
 */
public class HawkularProvider extends BaseProvider {

	private FormButton addButtonHandler = new FormButton("Add this Middleware Manager");
	private FormButton saveButtonHandler = new FormButton("Save changes");
	private Form mainFormHandler;
	
	private String name;
	private String hostname;
	private String port;
	private Object credentials;
	private Object key;

	
	
	public HawkularProvider(String name, String hostName, String port, Object credentials, Object key) {
		this.name =name;
		this.hostname = hostName;
		this.port = port;
		this.credentials = credentials;
		this.key = key;
		
		List<Tuple> fields = new ArrayList<Tuple>();
		fields.add(new Tuple("type_select", new AngularSelect("server_emstype")));
		fields.add(new Tuple("name_text", new Input("name")));
		fields.add(new Tuple("hostname_text", new Input("hostName")));
		fields.add(new Tuple("port_text", new Input("port")));
		
		this.mainFormHandler = new Form(fields.toArray(new Tuple[0])
		);
		
	}
	
    public String string_name() {
		return "middleware";
	}

	public String page_name() {
		return "middleware";
	}

	public String edit_page_suffix() {
		return "provider_edit_detail";
	}

	public String detail_page_suffix() {
		return "provider_detail";
	}

	public String refresh_text() {
		return "Refresh items and relationships";
	}

	public String quad_name() {
		return null;
	}

	public Form properties_form() {
		
		return mainFormHandler ;
	}

	public FormButton add_provider_button() {
		return addButtonHandler;
	}

	public FormButton save_button() {
		return saveButtonHandler;
	}

	@Override
	protected Kwargs _form_mapping(boolean create, Kwargs kwargs) {
		Kwargs mapping = new Kwargs();
		mapping.put("name_text", kwargs.get("name"));
		if (create) {
			mapping.put("type_select", kwargs.get("Hawkular"));	
		}
		mapping.put("hostname_text", kwargs.get("hostname"));
		mapping.put("port_text", kwargs.get("port"));
		return mapping;
	}

}

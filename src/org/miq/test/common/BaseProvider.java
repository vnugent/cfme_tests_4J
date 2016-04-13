package org.miq.test.common;

public abstract class BaseProvider implements ProviderDefinitionIF, ProviderOperationIF {

	public void create() {
	}

	public void update() {
	}

	public void delete() {
	}

	/**
	 * Provider implementation defines the mapping between 
	 * business logic value and form field name
	 * @param create true create the provider
	 * @param values to fill in the form
	 * @return kwargs field values in the form of <widget name, value>
	 */
	protected abstract Kwargs _form_mapping(boolean create, Kwargs kwargs);

}

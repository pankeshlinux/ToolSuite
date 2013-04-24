package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.List;

public class Action {

	private String name;
	private Parameter parameters;
	private String control;

	public Action(String name, Parameter parameters, String control) {
		super();
		this.name = name;
		this.parameters = parameters;
		this.control = control;
	}

	public String getName() {
		return name;
	}

	public Parameter getParameters() {
		return parameters;
	}

	public String getControl() {
		return this.control;
	}

	public List<Parameter> getAllParameter() {
		ArrayList<Parameter> allParameters = new ArrayList<Parameter>();
		allParameters.add(getParameters());
		return allParameters;
	}

	public boolean isParameter() {
		if (parameters != null)
			return true;
		else
			return false;
	}

}

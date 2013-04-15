package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;

public class ComputationalService extends SoftwareComponent<Information> {

	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	private Set<Action> actions = new HashSet<Action>();
	

	public ComputationalService(String name, Set<Attribute> attributes,
			Set<Information> generateInfo, Set<Information> consumeInfo,
			Set<DataAccess> dataAccess, Set<Action> actions, String partitionAttributeValue) {
		super(name, attributes, generateInfo, consumeInfo,
				partitionAttributeValue);
		this.dataAccess = dataAccess;
		this.actions = actions;
	}
	
	
	public Set<Action> getActions() {
		return actions;
	}

	public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());
		return allGeneratedInfo;
	}

	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	}

	private String packageName;

	public String getPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.frameworkDirPath);
		return packageName;
	}

	public String getLogicPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.logicDirPath);
		return packageName;
	}

	public String getUtilPackageName() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.utilDirPath);
		return packageName;
	}
}

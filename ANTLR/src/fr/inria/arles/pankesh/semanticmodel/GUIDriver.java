package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fr.inria.arles.pankesh.common.GlobalVariable;
import fr.inria.arles.pankesh.dslcompiler.Struct;

public class GUIDriver extends SoftwareComponent<Information> {

	private Set<Action> actions = new HashSet<Action>();
	private Set<Command> commands = new HashSet<Command>();
	private Set<DataAccess> dataAccess = new HashSet<DataAccess>();
	public String struct;
	
	public GUIDriver(String name, Set<Action> actionsList, Set<Command> commandsList,
			Set<Attribute> attributes, Set<Information> generateInfo,
			Set<Information> consumeInfo, Set<DataAccess> dataAccess, String struct) {
		super(name, attributes, generateInfo, consumeInfo, "NoInstance");
		this.actions = actionsList;
		this.commands = commandsList;
		this.dataAccess = dataAccess;
		this.struct = struct;

	}
	
	public Set<DataAccess> getDataAccess() {
		return dataAccess;
	}

	public List<DataAccess> getAllDataAccess() {
		ArrayList<DataAccess> allDataAccess = new ArrayList<DataAccess>();
		allDataAccess.addAll(getDataAccess());
		return allDataAccess;
	}

	public Set<Command> getCommands() {
		return commands;
	}
	
	public Set<Action> getActions() {
		return actions;
	}

	public List<Action> getAllActions() {
		ArrayList<Action> allGeneratedInfo = new ArrayList<Action>();
		allGeneratedInfo.addAll(getActions());
		return allGeneratedInfo;
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

	public String getFactoryPackageName() {

		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.factoryDirPath);
		return packageName;

	}

	public String getFactoryDeviceImplGUI() {
		packageName = GlobalVariable
				.convertPathTopackage(GlobalVariable.deviceImplDirPath);

		return packageName;

	}

}

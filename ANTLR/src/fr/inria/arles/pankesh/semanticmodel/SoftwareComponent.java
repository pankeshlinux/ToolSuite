package fr.inria.arles.pankesh.semanticmodel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class SoftwareComponent<I extends Information> {

	private String name;
	private Set<Attribute> attributes = new HashSet<Attribute>();
	private Set<I> generateInfo = new HashSet<I>();
	private Set<I> consumeInfo = new HashSet<I>();
	private String partitionAttributeVal;

	public SoftwareComponent(String name, Set<Attribute> attributes,
			Set<I> generateInfo, Set<I> consumeInfo,
			String partitionAttributeVal) {
		super();
		this.name = name;
		this.attributes = attributes;
		this.generateInfo = generateInfo;
		this.consumeInfo = consumeInfo;
		this.partitionAttributeVal = partitionAttributeVal;

	}

	public String getPartitionAttributeVal() {
		return partitionAttributeVal;
	}

	public boolean isGeneratedInfo() {
		if (generateInfo != null)
			return true;
		else
			return false;
	}

	public boolean isConsumedInfo() {
		if (consumeInfo != null)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public Set<Attribute> getAttributes() {
		return attributes;
	}

	public Set<I> getGenerateInfo() {
		return generateInfo;
	}

	public Set<I> getConsumeInfo() {
		return consumeInfo;
	}

	public List<I> getAllGeneratedInfo() {
		ArrayList<I> allGeneratedInfo = new ArrayList<I>();
		allGeneratedInfo.addAll(getGenerateInfo());
		return allGeneratedInfo;
	}

	public List<I> getAllConsumedInfo() {
		ArrayList<I> allConsumedInfo = new ArrayList<I>();
		allConsumedInfo.addAll(getConsumeInfo());
		return allConsumedInfo;
	}

	// This method is called by the CodeGenerator component
	public List<Attribute> getAllAttributes() {
		ArrayList<Attribute> allAttributes = new ArrayList<Attribute>();
		allAttributes.addAll(getAttributes());
		return allAttributes;
	}

}

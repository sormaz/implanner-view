/**
 * 
 */
package edu.ohiou.mfgresearch.implanner.view;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import edu.ohiou.mfgresearch.implanner.parts.MfgPartModel;
import Ontology.partloader.PartFeatureLoader;

/**
 * @author Sormaz
 *
 */
public class MfgPartModelLoader implements PartFeatureLoader {
	
	MfgPartModel partModel;

	
	
	public MfgPartModelLoader(MfgPartModel partModel) {
		super();
		this.partModel = partModel;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#load(java.io.FileInputStream)
	 */
	public PartFeatureLoader load(FileInputStream file) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readPartName()
	 */
	public String readPartName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readPartProperties()
	 */
	public Map<String, String> readPartProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readFeatures()
	 */
	public List<String> readFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readFeatureType(java.lang.String)
	 */
	public String readFeatureType(String featureName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readFeatureDimensions(java.lang.String)
	 */
	public Map<String, String> readFeatureDimensions(String featureName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readNextFeature(java.lang.String)
	 */
	public String readNextFeature(String featureName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readPreviousFeature(java.lang.String)
	 */
	public String readPreviousFeature(String featureName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Ontology.partloader.PartFeatureLoader#readTolerances(java.lang.String)
	 */
	public Map<String, String> readTolerances(String featureName) {
		// TODO Auto-generated method stub
		return null;
	}

}

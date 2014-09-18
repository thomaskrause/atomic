/**
 * 
 */
package de.uni_jena.iaa.linktype.atomic.editors.grapheditor.factories;

import org.eclipse.gef.requests.CreationFactory;

import de.hu_berlin.german.korpling.saltnpepper.salt.SaltFactory;
import de.hu_berlin.german.korpling.saltnpepper.salt.saltCommon.sDocumentStructure.SStructure;

/**
 * @author Stephan Druskat
 *
 */
public class SaltElementsFactory implements CreationFactory {

	public enum ElementType {
		STRUCTURE, SPAN, DOMINANCE_RELATION, ORDER_RELATION, POINTING_RELATION, SPANNING_RELATION
	}
	private SaltFactory sf = SaltFactory.eINSTANCE;
	private ElementType type;

	public SaltElementsFactory(ElementType type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
	 */
	@Override
	public Object getNewObject() {
		if (type == ElementType.STRUCTURE) {
			return sf.createSStructure();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
	 */
	@Override
	public Object getObjectType() {
		if (type == ElementType.STRUCTURE) {
			return SStructure.class;
		}
		return null;
	}

}

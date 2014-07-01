/**
 *  Copyright (c) 2013-2014 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.angularjs.internal.ui.validation;

import org.eclipse.angularjs.internal.ui.AngularScopeHelper;
import org.eclipse.angularjs.internal.ui.AngularUIMessages;
import org.eclipse.angularjs.internal.ui.Trace;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.osgi.util.NLS;
import org.eclipse.wst.sse.core.internal.provisional.text.IStructuredDocument;
import org.eclipse.wst.validation.internal.provisional.core.IMessage;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMAttr;

import tern.angular.AngularType;

public class ValidatorUtils {

	public static LocalizedMessage createMessage(IDOMAttr attr, AngularType type) {
		String textContent = AngularScopeHelper.getAngularValue(attr, type);
		int start = attr.getValueRegionStartOffset();
		return createMessage(attr, start, textContent, type);
	}

	public static LocalizedMessage createMessage(IDOMAttr node, int start,
			String textContent, AngularType type) {
		int length = textContent.trim().length() + 2;
		String messageText = NLS.bind(
				AngularUIMessages.Validation_AngularElementNotFound,
				type.name(), textContent);
		// nbElements,
		// textContent);
		int severity = IMessage.HIGH_SEVERITY; // getSeverity(reference,
												// nbElements);
		return createMessage(start, length, messageText, severity,
				node.getStructuredDocument());
	}

	public static LocalizedMessage createMessage(int start, int length,
			String messageText, int severity,
			IStructuredDocument structuredDocument) {
		int lineNo = getLineNumber(start, structuredDocument);
		LocalizedMessage message = new LocalizedMessage(severity, messageText);
		message.setOffset(start);
		message.setLength(length);
		message.setLineNo(lineNo);
		return message;
	}

	private static int getLineNumber(int start, IDocument document) {
		int lineNo = -1;
		try {
			lineNo = document.getLineOfOffset(start);
		} catch (BadLocationException e) {
			Trace.trace(Trace.SEVERE, e.getMessage(), e);
		}
		return lineNo;
	}
}

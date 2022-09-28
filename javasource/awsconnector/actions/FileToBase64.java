// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package awsconnector.actions;

import java.io.InputStream;
import java.util.Base64;
import org.apache.commons.io.IOUtils;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class FileToBase64 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __inputFile;
	private system.proxies.FileDocument inputFile;

	public FileToBase64(IContext context, IMendixObject inputFile)
	{
		super(context);
		this.__inputFile = inputFile;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.inputFile = this.__inputFile == null ? null : system.proxies.FileDocument.initialize(getContext(), __inputFile);

		// BEGIN USER CODE
		if (inputFile == null) {
			throw new IllegalArgumentException("Source file is null");
		}
		if (!inputFile.getHasContents()) {
			throw new IllegalArgumentException("Source file has no contents!");
		}

		try (InputStream f = Core.getFileDocumentContent(this.getContext(), inputFile.getMendixObject())) {
			return Base64.getEncoder().encodeToString(IOUtils.toByteArray(f));
		}
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "FileToBase64";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

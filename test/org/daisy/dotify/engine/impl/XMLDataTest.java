package org.daisy.dotify.engine.impl;

import java.io.IOException;

import org.daisy.dotify.api.engine.LayoutEngineException;
import org.daisy.dotify.api.writer.PagedMediaWriterConfigurationException;
import org.junit.Test;
public class XMLDataTest extends AbstractFormatterEngineTest {
	
	@Test
	public void testXMLData_01() throws LayoutEngineException, IOException, PagedMediaWriterConfigurationException {
		testPEF("resource-files/xml-data-input.obfl", "resource-files/xml-data-expected.pef", false);
	}

}
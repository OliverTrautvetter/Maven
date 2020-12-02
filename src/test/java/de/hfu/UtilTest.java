package test.java.de.hfu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilTest {

	@Test
	public void testIstErstesHalbjahr() {
		assertTrue("Januar", Util.istErstesHalbjahr(1));
		assertTrue("Februar", Util.istErstesHalbjahr(2));
		assertTrue("März", Util.istErstesHalbjahr(3));
		assertTrue("April", Util.istErstesHalbjahr(4));
		assertTrue("Mai", Util.istErstesHalbjahr(5));
		assertTrue("Juni", Util.istErstesHalbjahr(6));
//		assertFalse("Juli", Util.istErstesHalbjahr(7));
		assertFalse("August", Util.istErstesHalbjahr(8));
		assertFalse("September", Util.istErstesHalbjahr(9));
		assertFalse("Oktober", Util.istErstesHalbjahr(10));
		assertFalse("November", Util.istErstesHalbjahr(11));
		assertFalse("Dezember", Util.istErstesHalbjahr(12));
//		assertFalse("Dubioser Monat", Util.istErstesHalbjahr(13));
	}
}

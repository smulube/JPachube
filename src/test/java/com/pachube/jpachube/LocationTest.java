package com.pachube.jpachube;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class LocationTest {

    private Location location;

    @Before
    public void before() {
      location = new Location();
      location.setLon(55.1);
      location.setLat(-0.08);
      location.setName("Location Name");
      location.setElevation(12.3);
      location.setDomain(Domain.physical);
      location.setDisposition(Disposition.fixed);
      location.setExposure(Exposure.indoor);
    }

    @Test
    public void testLocationAttributes() {
        assertEquals(55.1, location.getLon(), 0);
        assertEquals(-0.08, location.getLat(), 0);
        assertEquals("Location Name", location.getName());
        assertEquals(12.3, location.getElevation(), 0);
        assertEquals(Domain.physical, location.getDomain());
        assertEquals(Disposition.fixed, location.getDisposition());
        assertEquals(Exposure.indoor, location.getExposure());
    }

    @Test
    public void testStringLatLon() {
      location.setLon("21.1");
      location.setLat("16.08");
      assertEquals(21.1, location.getLon(), 0);
      assertEquals(16.08, location.getLat(), 0);
    }

    @Test
    public void testToXml() {
      String xml = "<location domain=\"physical\" exposure=\"indoor\" disposition=\"fixed\" >\n\t\t" +
        "<name>Location Name</name>\n\t\t" +
        "<lat>-0.08</lat>\n\t\t" +
        "<lon>55.1</lon>\n\t\t" +
        "<ele>12.3</ele>\n\t" +
        "</location>";

      assertEquals(xml, location.toXML());
    }

    @Test
    public void testInvalidLat() {
      location.setLat("foo");
      assertEquals(0, location.getLat(), 0);
    }

    @Test
    public void testInvalidLon() {
      location.setLon("foo");
      assertEquals(0, location.getLon(), 0);
    }
}

package com.pachube.jpachube;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class LocationTest {

    @Test
    public void testLocationCreate() {
        Location location = new Location();
        location.setLon(55.1);
        location.setLat(-0.08);
        location.setName("Location Name");
        assertEquals(55.1, location.getLon(), 0);
        assertEquals(-0.08, location.getLat(), 0);
        assertEquals("Location Name", location.getName());
    }

    @Test
    public void testStringLatLon() {
      Location location = new Location();
      location.setLon("55.1");
      location.setLat("-0.08");
      assertEquals(55.1, location.getLon(), 0);
      assertEquals(-0.08, location.getLat(), 0);
    }
}

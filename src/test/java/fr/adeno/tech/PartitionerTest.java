package fr.adeno.tech;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PartitionerTest {
	
	private List<String> list;
	
	@Before
	public void init() {
		list = Arrays.asList("1", "2", "3", "4", "5");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void partition_PartitionSizeEqualsZero_ShouldThrowException() {
		Partitioner.partitionIt(list, 0);
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected = IllegalArgumentException.class)
	public void partition_ListIsEmptyOrNull_ShouldThrowException() {
		System.out.println(Partitioner.partitionIt(list, 5));
		Partitioner.partitionIt(Collections.EMPTY_LIST, 3);
	}
	
	@Test
	public void partition_SuccessfulCase_1() {
		List<List<String>> expectedList = Arrays.asList(Arrays.asList("1", "2", "3"), Arrays.asList("4", "5"));
		assertEquals(Partitioner.partitionIt(list, 3), expectedList);
	}
	
	@Test
	public void partition_SuccessfulCase_2() {
		List<List<String>> expectedList = Arrays.asList(Arrays.asList("1", "2"), Arrays.asList("3", "4"), Arrays.asList("5"));
		assertEquals(Partitioner.partitionIt(list, 2), expectedList);
	}
	
	@Test
	public void partition_SuccessfulCase_3() {
		List<List<String>> expectedList = Arrays.asList(Arrays.asList("1"), Arrays.asList("2"), Arrays.asList("3"), Arrays.asList("4"), Arrays.asList("5"));
		assertEquals(Partitioner.partitionIt(list, 1), expectedList);
	}
	
}

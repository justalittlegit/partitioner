package fr.adeno.tech;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Partitioner {
	
	public static <T> List<List<T>> partitionIt(List<T> list, Integer maxPartitionSize) {
		if (maxPartitionSize < 1) {
			throw new IllegalArgumentException("break size should be greater than zero");
		}
		
		if (list  == null || list.isEmpty()) {
			throw new IllegalArgumentException("list is emtpty");
		}
		
		final AtomicInteger count = new AtomicInteger(0);
		Map<Object, List<T>> result = list.stream().collect(Collectors.groupingBy(t -> count.getAndIncrement() / maxPartitionSize));
		return new ArrayList<>(result.values());
	}
}

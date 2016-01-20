package leetcode.problems.problem00218;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class HeapSolution {

    @Getter
    @AllArgsConstructor
    public class Building implements Comparable<Building> {

        private int left;
        private int right;
        private int height;

        @Override
        public int compareTo(Building o) {
            return Integer.compare(this.getHeight(), o.getHeight());
        }
    }

    @Getter
    @AllArgsConstructor
    public class BuildingEdge {

        private int x;
        private Building building;
        private boolean isStart;
    }

    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();

        if (buildings == null || buildings.length == 0) {
            return result;
        }

        List<Building> buildingObjects = makeBuildings(buildings);
        List<BuildingEdge> edges = makeEdges(buildingObjects);
        Comparator<BuildingEdge> edgeXComparator = (e1, e2) -> Integer.compare(e1.getX(), e2.getX());
        Comparator<BuildingEdge> edgeTypeComparator = (e1, e2) -> Boolean.compare(e2.isStart(), e1.isStart());
        Collections.sort(edges, edgeXComparator.thenComparing(edgeTypeComparator));

        PriorityQueue<Building> heap = new PriorityQueue<>(10, Collections.reverseOrder());
        int prevHighest = 0;

        for (int i = 0; i < edges.size(); i++) {
            BuildingEdge edge = edges.get(i);

            if (edge.isStart) {
                heap.add(edge.getBuilding());
            } else {
                heap.remove(edge.getBuilding());
            }

            if (i != edges.size() - 1 && edges.get(i + 1).x == edge.x) {
                continue;
            }

            int currentHighest = heap.isEmpty() ? 0 : heap.peek().getHeight();
            if (currentHighest != prevHighest) {
                result.add(new int[] { edge.x, currentHighest });
                prevHighest = currentHighest;
            }
        }

        return result;
    }

    private List<Building> makeBuildings(int[][] buildings) {
        List<Building> result = new ArrayList<>();
        for (int i = 0; i < buildings.length; i++) {
            int[] building = buildings[i];
            result.add(new Building(building[0], building[1], building[2]));
        }
        return result;
    }

    private List<BuildingEdge> makeEdges(List<Building> buildings) {
        List<BuildingEdge> edges = new ArrayList<>();
        for (Building building : buildings) {
            edges.add(new BuildingEdge(building.getLeft(), building, true));
            edges.add(new BuildingEdge(building.getRight(), building, false));
        }
        return edges;
    }
}

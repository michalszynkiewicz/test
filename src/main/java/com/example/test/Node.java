package com.example.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 */
public class Node {
    private final List<Node> neighbors = new ArrayList<>();
    public final String name;

    public Node(String name) {
        this.name = name;
    }

    public Collection<Node> achievableNodes() {
        // TODO: return a list of all nodes achievable from this node
        // TODO: you can add methods or fields to this class
        return null;
    }



    public Node addNeighbor(Node node) {
        neighbors.add(node);
        return this;
    }
}

package edu.upc.prop.domain.classes.evaluation;

import edu.upc.prop.domain.classes.clustering.ClusterResult;
import edu.upc.prop.domain.classes.distance.Distance;
import edu.upc.prop.domain.classes.vector.Vectorizer;

import java.util.*;

public class SSE {
    private final Distance dist;
    public SSE(Distance dist){ this.dist = dist; }

    public double compute(ClusterResult res, List<Vectorizer.Point> data){
        Map<String, Vectorizer.Point> byId = new HashMap<>();
        for (var p: data) byId.put(p.id(), p);

        double s=0;
        for (var e: res.assignments().entrySet()){
            var p = byId.get(e.getKey());
            var c = res.representatives().get(e.getValue());
            double d = dist.dist(p, c);
            s += d*d;
        }
        return s;
    }
}

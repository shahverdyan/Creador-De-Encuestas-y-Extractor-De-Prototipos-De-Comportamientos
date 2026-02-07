package edu.upc.prop.domain.classes.distance;

import edu.upc.prop.domain.classes.vector.Vectorizer;

public interface Distance {
    double calcularDistanciaNumerica(double a, double b);
    double dist(Vectorizer.Point a, Vectorizer.Point b);
}

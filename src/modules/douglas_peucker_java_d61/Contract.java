package com.igorkan.modules.douglas_peucker_java_d61;

public interface Contract {
    double perpendicularDistance(Types.Pt p, Types.Pt a, Types.Pt b);
    Types.Pt[] simplify(Types.Pt[] points, double epsilon);
}

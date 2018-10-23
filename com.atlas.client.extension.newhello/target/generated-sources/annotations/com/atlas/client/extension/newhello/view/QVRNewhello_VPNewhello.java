package com.atlas.client.extension.newhello.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVRNewhello_VPNewhello is a Querydsl query type for VPNewhello
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QVRNewhello_VPNewhello extends BeanPath<VRNewhello.VPNewhello> {

    private static final long serialVersionUID = -1579384675L;

    public static final QVRNewhello_VPNewhello vPNewhello = new QVRNewhello_VPNewhello("vPNewhello");

    public final SimplePath<VRNewhello.VTNewhello> vtNewhello = createSimple("vtNewhello", VRNewhello.VTNewhello.class);

    public QVRNewhello_VPNewhello(String variable) {
        super(VRNewhello.VPNewhello.class, forVariable(variable));
    }

    public QVRNewhello_VPNewhello(Path<? extends VRNewhello.VPNewhello> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVRNewhello_VPNewhello(PathMetadata metadata) {
        super(VRNewhello.VPNewhello.class, metadata);
    }

}


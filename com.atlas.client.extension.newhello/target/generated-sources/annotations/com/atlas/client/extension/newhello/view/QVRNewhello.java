package com.atlas.client.extension.newhello.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVRNewhello is a Querydsl query type for VRNewhello
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVRNewhello extends EntityPathBase<VRNewhello> {

    private static final long serialVersionUID = -493193731L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVRNewhello vRNewhello = new QVRNewhello("vRNewhello");

    public final QVRNewhello_VPNewhello vpNewhello;

    public QVRNewhello(String variable) {
        this(VRNewhello.class, forVariable(variable), INITS);
    }

    public QVRNewhello(Path<? extends VRNewhello> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVRNewhello(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVRNewhello(PathMetadata metadata, PathInits inits) {
        this(VRNewhello.class, metadata, inits);
    }

    public QVRNewhello(Class<? extends VRNewhello> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vpNewhello = inits.isInitialized("vpNewhello") ? new QVRNewhello_VPNewhello(forProperty("vpNewhello")) : null;
    }

}


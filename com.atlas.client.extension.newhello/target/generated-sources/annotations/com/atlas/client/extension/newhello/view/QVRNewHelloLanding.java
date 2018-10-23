package com.atlas.client.extension.newhello.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVRNewHelloLanding is a Querydsl query type for VRNewHelloLanding
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVRNewHelloLanding extends EntityPathBase<VRNewHelloLanding> {

    private static final long serialVersionUID = -652646022L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVRNewHelloLanding vRNewHelloLanding = new QVRNewHelloLanding("vRNewHelloLanding");

    public final QVRNewHelloLanding_VPNewhelloLanding vpNewhellolanding;

    public QVRNewHelloLanding(String variable) {
        this(VRNewHelloLanding.class, forVariable(variable), INITS);
    }

    public QVRNewHelloLanding(Path<? extends VRNewHelloLanding> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVRNewHelloLanding(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVRNewHelloLanding(PathMetadata metadata, PathInits inits) {
        this(VRNewHelloLanding.class, metadata, inits);
    }

    public QVRNewHelloLanding(Class<? extends VRNewHelloLanding> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vpNewhellolanding = inits.isInitialized("vpNewhellolanding") ? new QVRNewHelloLanding_VPNewhelloLanding(forProperty("vpNewhellolanding")) : null;
    }

}


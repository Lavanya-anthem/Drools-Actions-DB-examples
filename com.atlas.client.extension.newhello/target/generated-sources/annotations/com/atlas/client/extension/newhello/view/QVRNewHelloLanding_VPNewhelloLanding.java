package com.atlas.client.extension.newhello.view;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVRNewHelloLanding_VPNewhelloLanding is a Querydsl query type for VPNewhelloLanding
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QVRNewHelloLanding_VPNewhelloLanding extends BeanPath<VRNewHelloLanding.VPNewhelloLanding> {

    private static final long serialVersionUID = 876791031L;

    public static final QVRNewHelloLanding_VPNewhelloLanding vPNewhelloLanding = new QVRNewHelloLanding_VPNewhelloLanding("vPNewhelloLanding");

    public final SimplePath<VRNewHelloLanding.VTNewhelloLanding> vtNewhellolanding = createSimple("vtNewhellolanding", VRNewHelloLanding.VTNewhelloLanding.class);

    public QVRNewHelloLanding_VPNewhelloLanding(String variable) {
        super(VRNewHelloLanding.VPNewhelloLanding.class, forVariable(variable));
    }

    public QVRNewHelloLanding_VPNewhelloLanding(Path<? extends VRNewHelloLanding.VPNewhelloLanding> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVRNewHelloLanding_VPNewhelloLanding(PathMetadata metadata) {
        super(VRNewHelloLanding.VPNewhelloLanding.class, metadata);
    }

}


package com.atlas.client.extension.newhello.core;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QName is a Querydsl query type for Name
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QName extends EntityPathBase<Name> {

    private static final long serialVersionUID = 1416885536L;

    public static final QName name = new QName("name");

    public final com.antheminc.oss.nimbus.entity.QAbstractEntity_IdLong _super = new com.antheminc.oss.nimbus.entity.QAbstractEntity_IdLong(this);

    //inherited
    public final StringPath _class = _super._class;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdDate = _super.createdDate;

    public final StringPath firstName = createString("firstName");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lastName = createString("lastName");

    //inherited
    public final BooleanPath new$ = _super.new$;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QName(String variable) {
        super(Name.class, forVariable(variable));
    }

    public QName(Path<? extends Name> path) {
        super(path.getType(), path.getMetadata());
    }

    public QName(PathMetadata metadata) {
        super(Name.class, metadata);
    }

}


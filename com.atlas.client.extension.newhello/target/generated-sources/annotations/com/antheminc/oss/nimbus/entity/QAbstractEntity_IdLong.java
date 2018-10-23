package com.antheminc.oss.nimbus.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractEntity_IdLong is a Querydsl query type for IdLong
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QAbstractEntity_IdLong extends BeanPath<AbstractEntity.IdLong> {

    private static final long serialVersionUID = -2144920432L;

    public static final QAbstractEntity_IdLong idLong = new QAbstractEntity_IdLong("idLong");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final StringPath _class = _super._class;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> lastModifiedDate = _super.lastModifiedDate;

    //inherited
    public final BooleanPath new$ = _super.new$;

    //inherited
    public final NumberPath<Long> version = _super.version;

    public QAbstractEntity_IdLong(String variable) {
        super(AbstractEntity.IdLong.class, forVariable(variable));
    }

    public QAbstractEntity_IdLong(Path<? extends AbstractEntity.IdLong> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractEntity_IdLong(PathMetadata metadata) {
        super(AbstractEntity.IdLong.class, metadata);
    }

}


/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.bbs.entity.BBSSectionInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Mon Dec 24 19:03:55 CST 2018")
public class BBSSectionInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<BBSSectionInfo,String> creatorName;
    public static volatile SingularAttribute<BBSSectionInfo,String> forumId;
    public static volatile SingularAttribute<BBSSectionInfo,String> forumName;
    public static volatile SingularAttribute<BBSSectionInfo,String> icon;
    public static volatile SingularAttribute<BBSSectionInfo,String> id;
    public static volatile SingularAttribute<BBSSectionInfo,Boolean> indexRecommendable;
    public static volatile SingularAttribute<BBSSectionInfo,String> mainSectionId;
    public static volatile SingularAttribute<BBSSectionInfo,String> mainSectionName;
    public static volatile SingularAttribute<BBSSectionInfo,String> moderatorNames;
    public static volatile SingularAttribute<BBSSectionInfo,Integer> orderNumber;
    public static volatile SingularAttribute<BBSSectionInfo,Boolean> replyNeedAudit;
    public static volatile SingularAttribute<BBSSectionInfo,String> replyPublishAble;
    public static volatile SingularAttribute<BBSSectionInfo,Long> replyTotal;
    public static volatile SingularAttribute<BBSSectionInfo,Long> replyTotalToday;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionDescription;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionLevel;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionName;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionNotice;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionStatus;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionType;
    public static volatile SingularAttribute<BBSSectionInfo,String> sectionVisible;
    public static volatile SingularAttribute<BBSSectionInfo,Boolean> subSectionCreateAble;
    public static volatile SingularAttribute<BBSSectionInfo,Boolean> subjectNeedAudit;
    public static volatile SingularAttribute<BBSSectionInfo,String> subjectPublishAble;
    public static volatile SingularAttribute<BBSSectionInfo,Long> subjectTotal;
    public static volatile SingularAttribute<BBSSectionInfo,Long> subjectTotalToday;
    public static volatile SingularAttribute<BBSSectionInfo,String> subjectType;
    public static volatile SingularAttribute<BBSSectionInfo,String> typeCategory;
}
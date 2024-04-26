package com.hiep2211.shopapp.model.audits;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value ={ "createAt", "updateAt"},
        allowGetters = true
)
@Getter
@Setter
@ToString
public class DateAudit implements Serializable {

    @CreatedDate
    private Instant createDate;

    @LastModifiedDate
    private Instant updateAt;
}

package com.example.gojipserver.domain.checklist.entity.bathroomstatus;

import com.example.gojipserver.domain.checklist.entity.bathroomstatus.*;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BathRoomStatus {

    @Enumerated(EnumType.STRING)
    private Toilet toilet; //변기

    @Enumerated(EnumType.STRING)
    private WashStand washstand; //세면대

    @Enumerated(EnumType.STRING)
    private Sink sink; //싱크대

    @Enumerated(EnumType.STRING)
    private ShowerHead showerHead; //샤워기

    @Enumerated(EnumType.STRING)
    private HotWater hotWater; //온수

    @Enumerated(EnumType.STRING)
    private Tile tile; //타일


}

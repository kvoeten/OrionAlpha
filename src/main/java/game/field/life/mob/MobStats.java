/*
 * This file is part of OrionAlpha, a MapleStory Emulator Project.
 * Copyright (C) 2018 Eric Smith <notericsoft@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package game.field.life.mob;

/**
 *
 * @author Eric
 */
public class MobStats {
    public static final int
            PAD     = 0x1,
            PDD     = 0x2,
            MAD     = 0x4,
            MDD     = 0x8,
            ACC     = 0x10,
            EVA     = 0x20,
            Speed   = 0x40,
            // Doesn't do anything as far as I'm aware, but since
            // Poison exists, I'll assume this is just a dummy stat.
            Poison  = 0x80,
            // Since Freeze also freezes a mob, but is a visual,
            // I guess they are both the same MobStat?
            Freeze  = 0x100,
            Stun    = 0x100
    ;
}

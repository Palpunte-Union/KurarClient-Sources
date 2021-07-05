/*
 mod_MumbleLink - Positional Audio Communication for Minecraft with Mumble
 Copyright 2011-2013 zsawyer (http://sourceforge.net/users/zsawyer)

 This file is part of mod_MumbleLink
 (http://sourceforge.net/projects/modmumblelink/).

 mod_MumbleLink is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 mod_MumbleLink is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU Lesser General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with mod_MumbleLink.  If not, see <http://www.gnu.org/licenses/>.

 */

package zsawyer.mods.mumblelink.util;

import zsawyer.mods.mumblelink.MumbleLinkBase;
import zsawyer.mods.mumblelink.MumbleLinkImpl;
import zsawyer.mods.mumblelink.api.MumbleLink;

import javax.annotation.Nonnull;
import javax.management.InstanceNotFoundException;
import java.util.Optional;

/**
 * Helper utility class which provides easy access to instances relevant to the MumbleLink mod.
 */
public class InstanceHelper {

    private static MumbleLink mumbleLinkInstance;

    /**
     * Get an instance for the MumbleLink mod.
     * The instance will conform to the MumbleLink interface. If you need access implementation specific features file
     * a feature request at GitHub (http://sourceforge.net/projects/modmumblelink/) or SF (https://sourceforge.net/projects/modmumblelink/).
     *
     * @return the mod instance
     * @throws InstanceNotFoundException thrown when MumbleLink mod was not loaded first
     */
    public static MumbleLink getMumbleLink() throws InstanceNotFoundException {
        if (mumbleLinkInstance != null) {
            return mumbleLinkInstance;
        }

        mumbleLinkInstance = getModInstance();
        return mumbleLinkInstance;
    }

    /**
     * get the mod instance by id and make sure it is actually the right class
     *
     * @return the mod instance
     * @throws InstanceNotFoundException thrown when the mod is not (yet) loaded
     */
    public static MumbleLinkImpl getModInstance() throws InstanceNotFoundException {

        return MumbleLinkImpl.instance;
    }

    private InstanceHelper() {
    }
}

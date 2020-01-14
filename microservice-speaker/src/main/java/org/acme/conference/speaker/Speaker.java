/*
 * Copyright(c) 2016-2017 IBM, Red Hat, and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.conference.speaker;

import java.io.Serializable;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class Speaker implements Serializable {

    private static final long serialVersionUID = -8693770048623415961L;
    private String id;
    private String nameFirst;
    private String nameLast;
    private String organization;
    private String biography;
    private String picture;
    private String twitterHandle;

    //TODO @XmlElement(name = "_links") Who cam up with this name? It just causes a whole world of serialization and mapper config issues
    private Map<String, URI> links = new HashMap<>();

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getNameFirst() {
        return this.nameFirst;
    }

    public void setNameFirst(final String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return this.nameLast;
    }

    public void setNameLast(final String nameLast) {
        this.nameLast = nameLast;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(final String biography) {
        this.biography = biography;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(final String picture) {
        this.picture = picture;
    }

    public String getTwitterHandle() {
        return this.twitterHandle;
    }

    public void setTwitterHandle(final String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public Map<String, URI> getLinks() {
        return this.links;
    }

    public void setLinks(final Map<String, URI> links) {
        this.links = links;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((biography == null) ? 0 : biography.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((links == null) ? 0 : links.hashCode());
        result = prime * result + ((nameFirst == null) ? 0 : nameFirst.hashCode());
        result = prime * result + ((nameLast == null) ? 0 : nameLast.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((picture == null) ? 0 : picture.hashCode());
        result = prime * result + ((twitterHandle == null) ? 0 : twitterHandle.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Speaker other = (Speaker) obj;
        if (biography == null) {
            if (other.biography != null)
                return false;
        } else if (!biography.equals(other.biography))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (links == null) {
            if (other.links != null)
                return false;
        } else if (!links.equals(other.links))
            return false;
        if (nameFirst == null) {
            if (other.nameFirst != null)
                return false;
        } else if (!nameFirst.equals(other.nameFirst))
            return false;
        if (nameLast == null) {
            if (other.nameLast != null)
                return false;
        } else if (!nameLast.equals(other.nameLast))
            return false;
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else if (!organization.equals(other.organization))
            return false;
        if (picture == null) {
            if (other.picture != null)
                return false;
        } else if (!picture.equals(other.picture))
            return false;
        if (twitterHandle == null) {
            if (other.twitterHandle != null)
                return false;
        } else if (!twitterHandle.equals(other.twitterHandle))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Speaker [biography=" + biography + ", id=" + id + ", links=" + links + ", nameFirst=" + nameFirst
                + ", nameLast=" + nameLast + ", organization=" + organization + ", picture=" + picture
                + ", twitterHandle=" + twitterHandle + "]";
    }

}

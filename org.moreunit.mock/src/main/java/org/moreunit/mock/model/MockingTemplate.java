package org.moreunit.mock.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "mocking-template")
public class MockingTemplate
{
    @XmlAttribute(required = true)
    private String id;

    @XmlAttribute(required = true)
    private String name;

    @XmlElementRefs(value = { @XmlElementRef(type = CodeTemplate.class) })
    private List<CodeTemplate> codeTemplates;

    @SuppressWarnings("unused")
    private MockingTemplate()
    {
        // used by XML unmarshaller
    }

    public MockingTemplate(String id)
    {
        this.id = id;
    }

    public MockingTemplate(String id, String name, List<CodeTemplate> codeTemplates)
    {
        this.id = id;
        this.name = name;
        this.codeTemplates = codeTemplates;
    }

    public String id()
    {
        return id;
    }

    public String name()
    {
        return name;
    }

    public List<CodeTemplate> codeTemplates()
    {
        return codeTemplates;
    }

    @Override
    public String toString()
    {
        return String.format("MockingTemplate [id=%s, name=%s]", id, name);
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        MockingTemplate other = (MockingTemplate) obj;
        if(id == null)
        {
            if(other.id != null)
            {
                return false;
            }
        }
        else if(! id.equals(other.id))
        {
            return false;
        }
        return true;
    }

}

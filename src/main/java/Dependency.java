import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * <br>
 * Date: 28/08/2019
 */
public class Dependency {
    private final String groupId;
    private final String artifactId;
    private final List<Dependency> dependencies;

    public Dependency(String groupId, String artifactId) {
        this(groupId, artifactId, Collections.emptyList());
    }

    public Dependency(String groupId, String artifactId, List<Dependency> dependencies) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", groupId, artifactId);
    }

    public Collection<Dependency> transitiveDependencies() {
        // TODO
        return null;
    }
}

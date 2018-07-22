/**
 * [133] Clone Graph
 * 
 * difficulty: Medium
 * 
 * TestCase Example: {}
 * 
 * https://leetcode-cn.com/problems/clone-graph/
 * 
 * 
 * 
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * 
 * 
 * 
 * 
 * OJ's undirected graph serialization:
 * 
 * 
 * Nodes are labeled uniquely.
 * 
 * 
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * 
 * 
 * 
 * 
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * 
 * 
 * 
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * 
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * 
 * 
 * 
 * 
 * Visually, the graph looks like the following:
 * 
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * 
 * 
 * 
 * 
 * 
 * 
 * >>>>>>中文描述<<<<<<
 * 
 * 
 * [133] 克隆图
 * 
 * 
 * 克隆一张无向图，图中的每个节点包含一个 label （标签）和一个 neighbors （邻接点）列表 。
 * 
 * OJ的无向图序列化：
 * 
 * 节点被唯一标记。
 * 
 * 我们用 # 作为每个节点的分隔符，用 , 作为节点标签和邻接点的分隔符。
 * 
 * 例如，序列化无向图 {0,1,2#1,2#2,2}。
 * 
 * 该图总共有三个节点, 被两个分隔符  # 分为三部分。 
 * 
 * 
 * 	第一个节点的标签为 0，存在从节点 0 到节点 1 和节点 2 的两条边。
 * 	第二个节点的标签为 1，存在从节点 1 到节点 2 的一条边。
 * 	第三个节点的标签为 2，存在从节点 2 到节点 2 (本身) 的一条边，从而形成自环。
 * 
 * 
 * 我们将图形可视化如下：
 * 
 *        1
 *       / \
 *      /   \
 *     0 --- 2
 *          / \
 *          \_/
 * 
 */
/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public public class M_133_CloneGraph {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        
    }
}
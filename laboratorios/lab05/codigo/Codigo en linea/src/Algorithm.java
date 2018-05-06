public class Algorithm {



    public static boolean DFSColorFC(Tree tree) {
        return DFSColorFCAux(tree.getFirst(), 1);
    }

    private static boolean DFSColorFCAux(Node first, int color) {

        switch (first.setColor(color)) {
            case -1: {
                return false;
            }
            case 1: {
                for (Node node : first.getSuccessors()) {
                    if (!DFSColorFCAux(node ,color * -1)) {
                        return false;
                    }
                }
            }
            case 0: {
                return true;
            }
        }
        return true;
    }
}

package UI;

public abstract interface HUD {

    public static void menuStart(){
        System.out.println("\n" +
                "                                                          ______                                                                                                      \n" +
                "        _____      ___________         _____        _____|\\     \\   __     __                 _______     _______         ____    ___________      ______   _______   \n" +
                "   _____\\    \\_    \\          \\      /      |_     /     / |     | /  \\   /  \\               /      /|   |\\      \\    ____\\_  \\__ \\          \\    |\\     \\  \\      \\  \n" +
                "  /     /|     |    \\    /\\    \\    /         \\   |      |/     /|/   /| |\\   \\             /      / |   | \\      \\  /     /     \\ \\    /\\    \\    \\\\     \\  |     /| \n" +
                " /     / /____/|     |   \\_\\    |  |     /\\    \\  |      |\\____/ /   //   \\\\   \\           |      /  |___|  \\      |/     /\\      | |   \\_\\    |    \\|     |/     //  \n" +
                "|     | |_____|/     |      ___/   |    |  |    \\ |\\     \\    | /    \\_____/    \\          |      |  |   |  |      |     |  |     | |      ___/      |     |_____//   \n" +
                "|     | |_________   |      \\  ____|     \\/      \\| \\     \\___|/    /\\_____/\\    \\         |       \\ \\   / /       |     |  |     | |      \\  ____   |     |\\     \\   \n" +
                "|\\     \\|\\        \\ /     /\\ \\/    |\\      /\\     |  \\     \\  /    //\\_____/\\\\    \\        |      |\\\\/   \\//|      |     | /     /|/     /\\ \\/    \\ /     /|\\|     |  \n" +
                "| \\_____\\|    |\\__//_____/ |\\______| \\_____\\ \\_____\\  \\_____\\/____/ |       | \\____\\       |\\_____\\|\\_____/|/_____/|\\     \\_____/ /_____/ |\\______|/_____/ |/_____/|  \n" +
                "| |     /____/| | ||     | | |     | |     | |     |\\ |     ||    | |       | |    |       | |     | |   | |     | | \\_____\\   | /|     | | |     |     | / |    | |  \n" +
                " \\|_____|     |\\|_||_____|/ \\|_____|\\|_____|\\|_____| \\|_____||____|/         \\|____|        \\|_____|\\|___|/|_____|/ \\ |    |___|/ |_____|/ \\|_____|_____|/  |____|/   \n" +
                "        |____/                                                                                                       \\|____|                                          \n");
    }

    static void giveOptions(){
        System.out.println("1 - Obter cidades vizinhas\n2 - Obter todos os caminhos a partir de uma cidade:");
    }

}

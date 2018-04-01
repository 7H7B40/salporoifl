
import java.io.ObjectInputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class MinecraftGenerator {

	Random chunkseed = new Random();
	static Random worldseed = new Random();
	static int seed = 123456789;
	private static IntUnaryOperator squared = (a -> a ^ 2); // Java 8 street cred
	private static int m = (int) 6.022e23;
	static int k = 716;//this number was determined by CrafterDark

	static int s = seed;

	public MinecraftGenerator mg = new MinecraftGenerator();
	static ArrayDeque<String> list = new ArrayDeque<String>();
	private static final AtomicLong nextUniqueNumber = new AtomicLong();

	public void applyBiomes() {
		mg.nextNextGaussian.notifyAll();
	}

	static class Key1 implements Portal2Stronghold {
		public Key1(Class<?> interfaces) {
			System.out.println(interfaces.getSuperclass().getName().toCharArray().hashCode());
		}

		@Override
		public int returnseeds() {
			Key2 key2 = new Key2(this.getClass(), Random.class);
			seed = key2.hashCode();
			for (int i = 0; i < 100000;) {
				i += seed;
				return i;
			}
			return 0;
		}

		@Override
		public int findportals() {
			return list.add(Integer.toString(blockId.compareTo((long) k))) ? nextUniqueNumber.intValue()
					: worldseed.nextInt(worldseed.nextInt(333333));
		}

		@Override
		public boolean CUDA() {
			return false; //not today
		}
	}

	static int c = 299800000 * m / s; //speed of light

	private static int e = m * squared.applyAsInt(c);

	public UnaryOperator<Integer> LinearAlgebra = new UnaryOperator<Integer>() {
		int identitymatrix[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		public int eigenvalues = 33;

		@Override
		public Integer apply(Integer t) {

			return t * eigenvalues;
		}

	};

	public static int b = Integer.parseInt("b", 0x0f);

	static class Key2 {
		public Key2(Class<?> interface1, Class<?> interface3) {
			System.out.println(interface1.getClass().getName().toCharArray().hashCode() + 0x232
					+ interface3.getCanonicalName().toString().toString().toString());
		}
	}

	public static Long blockId = 0x36L;
	public Object nextNextGaussian = null;
	static int d = 64; //stack size in minecraft

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

		ObjectInputStream.GetField fields = s.readFields();

		// The seed is read in as {@code long} for
		// historical reasons, but it is converted to an AtomicLong.
		long seedVal = fields.get("seed", -1L);
		if (seedVal < 0)
			throw new java.io.StreamCorruptedException("Random: invalid seed");
		resetSeed(seedVal);
		nextNextGaussian = fields.get("nextNextGaussian", 0.0);
		haveNextNextGaussian = fields.get("haveNextNextGaussian", false);
	}

	public Boolean haveNextNextGaussian = false; // we don't have one
	private static int x = e + c + k + s + d + e + e;

	private void resetSeed(long seedVal) {
		seed = (int) seedVal;

	}

	private static int y = m * x + b;
	int user_input = 0;

	static class KeyX {
		public KeyX(Class<?> interfaces[]) {
			System.out.println(interfaces[0].getClassLoader().toString()
					+ ClassLoader.getSystemResource(Integer.toBinaryString(worldseed.nextInt())).toString()
							.toCharArray().hashCode());
		}
	}

	KeyFactory keyFactory = new KeyFactory();
	static int key = k + e ^ y;

	public int getNewWorldSeed() {

		int newseed = user_input;

		if ("".equals(not(newseed))) {
			return Integer.hashCode(newseed);
		}

		for (int i = 0; i < 10000; i++) {
			if (pandasVideoSaysThatThisSeedCanHappen(i)) {
				return i; //we should always find a new valid seed
			}
		}

		return oldseed; //this code should never run

	}

	interface Portal2Stronghold {
		public int returnseeds();

		public int findportals();

		public boolean CUDA();

		public default void splashmessage(String username) {
			switch (username) {
			case "notch":
				System.out.println("you win");
				break;
			case "minecraft devs":
				System.out.println("you win");
				break;
			case "redstone community":
				System.out.println("all your stuff will break in 1.13");
				break;
			}

		}

		public String toString();
	}

	int oldseed = 1;

	public boolean pandasVideoSaysThatThisSeedCanHappen(int seed) {
		return false;
	}

	public int not(int i) {
		return 1 - i;
	}

	private static final class KeyFactory implements BiFunction<ClassLoader, Class<?>[], Object>, Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = -1531195015077739419L;
		private static final long SerialVisionUUID = 0xC1A551CAL;

		@Override
		public Object apply(ClassLoader classLoader, Class<?>[] interfaces) {
			switch (interfaces.length) {
			case 1:
				return new Key1(interfaces[0]); // the most frequent
			case 2:
				return new Key2(interfaces[0], interfaces[1]);
			case 0:
				return key0;
			default:
				return new KeyX(interfaces);
			}
		}

		public static long getSerialuuid() {
			return SerialVisionUUID;
		}

		static enum State {
			LL("X..."), LU("..X."), LD(".X.."), LRU("...X"), LRD("...X"), RR("...X"), RU("..X."), RD(".X.."), RLU(
					"X..."), RLD("X...");
			State[] next;
			String code;

			State(String code) {
				this.code = code;
			}

			public String toString() {
				return code;
			}

			public void to(State... states) {
				next = states;
			}

			public static void init(boolean cross, boolean tswitch, boolean jack) {
				if (!cross && !tswitch) {
					LL.to(RR, RU, RD);
					LU.to(RR, RD);
					LD.to(RR, RU);
					RR.to(LL, LU, LD);
					RU.to(LL, LD);
					RD.to(LL, LU);
				}
			}
		}

		public static void moan(String[] args) {
			State.init(false, false, false);
			Random r = new Random();
			//lead with an LL or RR
			State mystate = r.nextBoolean() ? State.LL : State.RR;
			for (int i = 0; i < 100; i++) {
				System.out.println(mystate);
				mystate = mystate.next[r.nextInt(mystate.next.length)];
			}
		}

		static class Unsafe {
			// its dangerous to go alone, take this
			public Unsafe() {
				if (enablebugs)
					enablebugs = false;
			}
		}

		static int key0 = key + 0;

		/**
		 * Serializable fields for Random.
		 *
		 * @serialField seed
		 *                  long seed for random computations
		 * @serialField nextNextGaussian
		 *                  double next Gaussian to be returned
		 * @serialField haveNextNextGaussian
		 *                  boolean nextNextGaussian is valid
		 */
		public static void main(String[] args) {
			System.out.println("invalid arguments!");
			System.out.println("use: minecraftgenerator.exe -s <seed>");
		}

		/*
		 * This code is intentionally left blank
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Unsafe unsafe = new Unsafe();

		public static boolean enablebugs = true;

		private static final ObjectStreamField[] serialPersistentFields = { new ObjectStreamField("seed", Long.TYPE),
				new ObjectStreamField("nextNextGaussian", Double.TYPE),
				new ObjectStreamField("haveNextNextGaussian", Boolean.TYPE) };
	}
}

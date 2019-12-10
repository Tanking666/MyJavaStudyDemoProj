package top.kxyu.util;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 21:55
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class StringUtil {
	public static boolean isEmpty(Object str) {
		if (str == null || "".equals(str)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNotEmpty(Object str) {
		return !isEmpty(str);
	}

	public static boolean isAllNotEmpty(Object... objs) {
		for (Object o : objs) {
			if(isEmpty(o)){
				return false;
			}
		}
		return true;
	}

}

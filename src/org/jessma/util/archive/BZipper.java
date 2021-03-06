/*
 * Copyright Bruce Liang (ldcsaa@gmail.com)
 *
 * Version	: JessMA 3.3.1
 * Author	: Bruce Liang
 * Website	: http://www.jessma.org
 * Porject	: https://code.google.com/p/portal-basic
 * Bolg		: http://www.cnblogs.com/ldcsaa
 * WeiBo	: http://weibo.com/u/1402935851
 * QQ Group	: 75375912
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jessma.util.archive;

/** BZIP2 压缩执行器类 */
public class BZipper extends Tarrer
{
	/** BZIP2 文件后缀名 */
	public static final String STUFFIX = ".tar.bz2";

	public BZipper(String source)
	{
		super(source);
	}
	
	public BZipper(String source, String target)
	{
		super(source, target);
	}
	
	/** 获取 BZIP2 文件压缩模式 */
	@Override
	protected String getCompressionMode()
	{
		return COMPRESS_MODES[2];
	}
	
	/** 获取压缩文件后缀名 */
	@Override
	public String getSuffix()
	{
		return STUFFIX;
	}
}

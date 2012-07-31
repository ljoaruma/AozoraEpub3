package com.github.hmdev.info;

/** セクションの情報 xhtmlに対応 */
public class SectionInfo
{
	/** セクションID 0001～ */
	public String sectionId;
	
	/** 画像のみのページ時をページ内に合わせる場合にtrue */
	public boolean imageFit = false;
	/** 画像のみのページで高さに合わる場合にtrue */
	public boolean imageFitH = false;
	
	/** セクション開始行 */
	public int startLine = 0;
	
	/** セクション終了行 */
	public int endLine = 0;
	
	public SectionInfo(String sectionId)
	{
		this.sectionId = sectionId;
	}
	
	public String getSectionId()
	{
		return sectionId;
	}

	public void setSectionId(String sectionId)
	{
		this.sectionId = sectionId;
	}

	public boolean isImageFit()
	{
		return imageFit;
	}

	public void setImageFit(boolean imageFit)
	{
		this.imageFit = imageFit;
	}

	public boolean isImageFitH()
	{
		return imageFitH;
	}

	public void setImageFitH(boolean imageFitH)
	{
		this.imageFitH = imageFitH;
	}

	public int getStartLine()
	{
		return startLine;
	}

	public void setStartLine(int startLine)
	{
		this.startLine = startLine;
	}

	public int getEndLine()
	{
		return endLine;
	}

	public void setEndLine(int endLine)
	{
		this.endLine = endLine;
	}
}
